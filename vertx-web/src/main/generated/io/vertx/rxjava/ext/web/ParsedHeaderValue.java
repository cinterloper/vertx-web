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

package io.vertx.rxjava.ext.web;

import java.util.Map;
import rx.Observable;
import java.util.Map;


public interface ParsedHeaderValue {

  Object getDelegate();

  /**
   * Contains the raw value that was received from the user agent 
   * @return 
   */
  public String rawValue();

  /**
   * Holds the unparsed value of the header.<br>
   * For the most part, this is the content before the semi-colon (";")
   * @return 
   */
  public String value();

  /**
   * Holds the weight specified in the "q" parameter of the header.<br>
   * If the parameter is not specified, 1.0 is assumed according to 
   * <a href="https://tools.ietf.org/html/rfc7231#section-5.3.1">rfc7231</a>
   * @return 
   */
  public float weight();

  /**
   * The value of the parameter specified by this key. Each is one of 3 things:
   * <ol>
   * <li>null &lt;- That key was not specified</li>
   * <li>ParsedHeaderValue.EMPTY (tested using ==) &lt;- The value was not specified</li>
   * <li>[Other] <- The value of the parameter</li>
   * </ol>
   * <b>Note:</b> The <code>q</code> parameter is never present.
   * @param key 
   * @return 
   */
  public String parameter(String key);

  /**
   * The parameters specified in this header value.
   * <b>Note:</b> The <code>q</code> parameter is never present.
   * @return Unmodifiable Map of parameters of this header value
   */
  public Map<String,String> parameters();

  /**
   * Is this an allowed operation as specified by the corresponding header?
   * @return 
   */
  public boolean isPermitted();

  /**
   * Test if this header is matched by matchTry header 
   * @param matchTry The header to be matched from
   * @return true if this header represents a subset of matchTry, otherwise, false
   */
  public boolean isMatchedBy(ParsedHeaderValue matchTry);

  /**
   * An integer that represents the absolute order position of this header
   * @return 
   */
  public int weightedOrder();


  public static ParsedHeaderValue newInstance(io.vertx.ext.web.ParsedHeaderValue arg) {
    return arg != null ? new ParsedHeaderValueImpl(arg) : null;
  }
}

class ParsedHeaderValueImpl implements ParsedHeaderValue {
  final io.vertx.ext.web.ParsedHeaderValue delegate;

  public ParsedHeaderValueImpl(io.vertx.ext.web.ParsedHeaderValue delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  /**
   * Contains the raw value that was received from the user agent 
   * @return 
   */
  public String rawValue() { 
    String ret = delegate.rawValue();
    return ret;
  }

  /**
   * Holds the unparsed value of the header.<br>
   * For the most part, this is the content before the semi-colon (";")
   * @return 
   */
  public String value() { 
    String ret = delegate.value();
    return ret;
  }

  /**
   * Holds the weight specified in the "q" parameter of the header.<br>
   * If the parameter is not specified, 1.0 is assumed according to 
   * <a href="https://tools.ietf.org/html/rfc7231#section-5.3.1">rfc7231</a>
   * @return 
   */
  public float weight() { 
    float ret = delegate.weight();
    return ret;
  }

  /**
   * The value of the parameter specified by this key. Each is one of 3 things:
   * <ol>
   * <li>null &lt;- That key was not specified</li>
   * <li>ParsedHeaderValue.EMPTY (tested using ==) &lt;- The value was not specified</li>
   * <li>[Other] <- The value of the parameter</li>
   * </ol>
   * <b>Note:</b> The <code>q</code> parameter is never present.
   * @param key 
   * @return 
   */
  public String parameter(String key) { 
    String ret = delegate.parameter(key);
    return ret;
  }

  /**
   * The parameters specified in this header value.
   * <b>Note:</b> The <code>q</code> parameter is never present.
   * @return Unmodifiable Map of parameters of this header value
   */
  public Map<String,String> parameters() { 
    Map<String,String> ret = delegate.parameters();
    return ret;
  }

  /**
   * Is this an allowed operation as specified by the corresponding header?
   * @return 
   */
  public boolean isPermitted() { 
    boolean ret = delegate.isPermitted();
    return ret;
  }

  /**
   * Test if this header is matched by matchTry header 
   * @param matchTry The header to be matched from
   * @return true if this header represents a subset of matchTry, otherwise, false
   */
  public boolean isMatchedBy(ParsedHeaderValue matchTry) { 
    boolean ret = delegate.isMatchedBy((io.vertx.ext.web.ParsedHeaderValue)matchTry.getDelegate());
    return ret;
  }

  /**
   * An integer that represents the absolute order position of this header
   * @return 
   */
  public int weightedOrder() { 
    int ret = delegate.weightedOrder();
    return ret;
  }

}
