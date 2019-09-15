/*
 * Copyright 2018 ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package tech.pegasys.pantheon.ethereum.api.graphql;

import java.util.Set;

import io.vertx.core.json.JsonObject;
import org.assertj.core.api.Assertions;

class GraphQLTestHelper {

  void assertValidGraphQLResult(final JsonObject json) {
    // Check all expected fieldnames are set
    final Set<String> fieldNames = json.fieldNames();
    Assertions.assertThat(fieldNames.size()).isEqualTo(1);
    Assertions.assertThat(fieldNames.contains("data")).isTrue();
  }

  void assertValidGraphQLError(final JsonObject json) {
    // Check all expected fieldnames are set
    final Set<String> fieldNames = json.fieldNames();
    Assertions.assertThat(fieldNames.size()).isEqualTo(1);
    Assertions.assertThat(fieldNames.contains("errors")).isTrue();
  }
}