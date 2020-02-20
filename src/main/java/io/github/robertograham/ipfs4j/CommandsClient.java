package io.github.robertograham.ipfs4j;

import feign.Param;
import feign.RequestLine;

public interface CommandsClient {

  @RequestLine("GET /api/v0/commands?flags={flags}")
  CommandsResponse commands(@Param("flags") Boolean flags);
}