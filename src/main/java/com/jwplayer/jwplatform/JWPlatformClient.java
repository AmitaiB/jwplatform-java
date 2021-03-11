package com.jwplayer.jwplatform;

/**
 * JW Platform API client.
 *
 * <p>An API client for the JW Platform. For the API documentation see:
 * https://developer.jwplayer.com/jwplayer/docs
 *
 * <p>Example:
 *    JWPlatformClient client = JWPlatformClient.create(secret, host);
 */

interface JWPlatformClient {
	JWPlatformClient create(String secret);
}
