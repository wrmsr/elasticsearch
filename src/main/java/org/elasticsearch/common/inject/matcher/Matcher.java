/**
 * Copyright (C) 2006 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.elasticsearch.common.inject.matcher;

/**
 * Returns {@code true} or {@code false} for a given input.
 *
 * @author crazybob@google.com (Bob Lee)
 */
public interface Matcher<T> {

  /**
   * Returns {@code true} if this matches {@code t}, {@code false} otherwise.
   */
  boolean matches(T t);

  /**
   * Returns a new matcher which returns {@code true} if both this and the
   * given matcher return {@code true}.
   */
  Matcher<T> and(Matcher<? super T> other);

  /**
   * Returns a new matcher which returns {@code true} if either this or the
   * given matcher return {@code true}.
   */
  Matcher<T> or(Matcher<? super T> other);
}
