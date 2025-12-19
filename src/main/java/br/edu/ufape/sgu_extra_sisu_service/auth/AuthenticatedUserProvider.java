package br.edu.ufape.sgu_extra_sisu_service.auth;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class AuthenticatedUserProvider {

    public UUID getUserId() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication instanceof JwtAuthenticationToken jwtToken) {
            String subject = jwtToken.getToken().getSubject();
            try {
                return UUID.fromString(subject);
            } catch (IllegalArgumentException e) {
                throw new IllegalStateException("Subject do JWT não é um UUID válido: " + subject);
            }
        }
        throw new IllegalStateException("Usuário não autenticado via JWT.");
    }
}