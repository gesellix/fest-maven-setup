/*
 * Created on Jul 16, 2009
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 * Copyright @2009-2010 the original author or authors.
 */
package org.fest.swing.driver;

import static org.fest.assertions.Assertions.assertThat;
import static org.fest.swing.core.TestRobots.singletonRobotMock;

import org.junit.*;

/**
 * Tests for <code>{@link JTreeDriver#separator(String)}</code>.
 *
 * @author Alex Ruiz
 */
public class JTreeDriver_separator_Test {

  private JTreeDriver driver;

  @Before public void setUp() {
    driver = new JTreeDriver(singletonRobotMock());
  }

  @Test(expected = NullPointerException.class)
  public void shouldThrowErrorIfSeparatorIsNull() {
    driver.separator(null);
  }

  @Test
  public void shouldSetPathSeparator() {
    driver.separator("|");
    assertThat(driver.separator()).isEqualTo("|");
  }

}
