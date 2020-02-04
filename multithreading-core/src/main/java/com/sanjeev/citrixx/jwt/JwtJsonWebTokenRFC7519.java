package com.sanjeev.citrixx.jwt;

public class JwtJsonWebTokenRFC7519 {

/**
     *   JWT is used for authorization
     *   WebApp -> URL -> Who you are? Authentication, What you can do: Authorization
     *   Until you logoff you have 1. session token and 2. JWT token
     *   Approach 1:: user requests and server gives the sessionId,
     *   cookie has session in the header as it saves after the first request
     *
     *   Approach 2:: user -> LoadBalancer -> {Server 1, Server2, Server3}  Server 1 gave the sessionId, but the 2nd request
     *   goes to Server2, it gives the different SessionId2.
     *
     *   (customer -> Bank ( Write down the details and come back tomorrow with the paper and sign the paper)
     *   new support employee -> will verify the paper with sign -> JWT token
     *
     *   Each request client sends JWT (json  web tokens), "Signed JWT sends to server each time" -> server verifies the signature
     *
     *  Session ID -> Reference Token
     *  JWT -> Value Token "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c"
     *  Header:
     *  {
     *   "alg": "HS256",
     *   "typ": "JWT"
     * }
     *
     * Payload:
     * {
     *   "sub": "1234567890",
     *   "name": "John Doe",
     *   "iat": 1516239022
     * }
     *
     * HMACSHA256(
     *   base64UrlEncode(header) + "." +
     *   base64UrlEncode(payload),
     *
     * your-256-bit-secret
     */
    public static void main(String[] args) {

    }
}
