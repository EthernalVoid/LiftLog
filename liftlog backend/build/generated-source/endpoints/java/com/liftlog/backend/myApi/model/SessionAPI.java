/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-08-03 17:34:38 UTC)
 * on 2015-10-05 at 22:24:45 UTC 
 * Modify at your own risk.
 */

package com.liftlog.backend.myApi.model;

/**
 * Model definition for SessionAPI.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the myApi. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SessionAPI extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long date;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LiftAPI> lifts;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer sequenceNum;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getDate() {
    return date;
  }

  /**
   * @param date date or {@code null} for none
   */
  public SessionAPI setDate(java.lang.Long date) {
    this.date = date;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public SessionAPI setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<LiftAPI> getLifts() {
    return lifts;
  }

  /**
   * @param lifts lifts or {@code null} for none
   */
  public SessionAPI setLifts(java.util.List<LiftAPI> lifts) {
    this.lifts = lifts;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSequenceNum() {
    return sequenceNum;
  }

  /**
   * @param sequenceNum sequenceNum or {@code null} for none
   */
  public SessionAPI setSequenceNum(java.lang.Integer sequenceNum) {
    this.sequenceNum = sequenceNum;
    return this;
  }

  @Override
  public SessionAPI set(String fieldName, Object value) {
    return (SessionAPI) super.set(fieldName, value);
  }

  @Override
  public SessionAPI clone() {
    return (SessionAPI) super.clone();
  }

}
