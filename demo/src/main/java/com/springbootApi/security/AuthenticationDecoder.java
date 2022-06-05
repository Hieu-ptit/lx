package com.springbootApi.security;

import com.dslplatform.json.JsonReader;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springbootApi.model.response.AccountAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

@Component
public class AuthenticationDecoder {
//  private static final JsonReader.ReadObject<AccountAuth> lxUserReader = Json.findReader(AccountAuth.class);

  @Autowired
  private ObjectMapper objectMapper;

  public Authentication decode(String token) throws IOException {
      String[] chunks = token.split("\\.");
      Base64.Decoder decoder = Base64.getUrlDecoder();
      String payload = new String(decoder.decode(chunks[1]));
      AccountAuth accountAuth = objectMapper.readValue(payload, AccountAuth.class);
      return new UsernamePasswordAuthenticationToken(accountAuth, token, List.of(new SimpleGrantedAuthority("USER")));
  }
}
