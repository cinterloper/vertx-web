/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.rxjava.ext.web.handler;

import java.util.Map;
import rx.Observable;
import io.vertx.rxjava.ext.web.Route;
import java.util.Set;
import io.vertx.core.json.JsonObject;
import io.vertx.rxjava.ext.web.RoutingContext;
import io.vertx.rxjava.ext.auth.oauth2.OAuth2Auth;

/**
 * An auth handler that provides OAuth2 Authentication support. This handler is suitable for AuthCode flows.
 *
 * <p/>
 * NOTE: This class has been automatically generated from the {@link io.vertx.ext.web.handler.OAuth2AuthHandler original} non RX-ified interface using Vert.x codegen.
 */

public class OAuth2AuthHandler implements AuthHandler {

  final io.vertx.ext.web.handler.OAuth2AuthHandler delegate;

  public OAuth2AuthHandler(io.vertx.ext.web.handler.OAuth2AuthHandler delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  public void handle(RoutingContext arg0) { 
    delegate.handle((io.vertx.ext.web.RoutingContext)arg0.getDelegate());
  }

  /**
   * Add a required authority for this auth handler
   * @param authority the authority
   * @return a reference to this, so the API can be used fluently
   */
  public AuthHandler addAuthority(String authority) { 
    delegate.addAuthority(authority);
    return this;
  }

  /**
   * Add a set of required authorities for this auth handler
   * @param authorities the set of authorities
   * @return a reference to this, so the API can be used fluently
   */
  public AuthHandler addAuthorities(Set<String> authorities) { 
    delegate.addAuthorities(authorities);
    return this;
  }

  /**
   * Create a OAuth2 auth handler
   * @param authProvider the auth provider to use
   * @param uri 
   * @return the auth handler
   */
  public static OAuth2AuthHandler create(OAuth2Auth authProvider, String uri) { 
    OAuth2AuthHandler ret = OAuth2AuthHandler.newInstance(io.vertx.ext.web.handler.OAuth2AuthHandler.create((io.vertx.ext.auth.oauth2.OAuth2Auth)authProvider.getDelegate(), uri));
    return ret;
  }

  /**
   * Extra parameters needed to be passed while requesting a token.
   * @param extraParams extra optional parameters.
   * @return self
   */
  public OAuth2AuthHandler extraParams(JsonObject extraParams) { 
    delegate.extraParams(extraParams);
    return this;
  }

  /**
   * add the callback handler to a given route.
   * @param route a given route e.g.: `/callback`
   * @return self
   */
  public OAuth2AuthHandler setupCallback(Route route) { 
    delegate.setupCallback((io.vertx.ext.web.Route)route.getDelegate());
    return this;
  }


  public static OAuth2AuthHandler newInstance(io.vertx.ext.web.handler.OAuth2AuthHandler arg) {
    return arg != null ? new OAuth2AuthHandler(arg) : null;
  }
}
