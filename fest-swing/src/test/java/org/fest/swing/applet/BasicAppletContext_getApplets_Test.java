/*
 * Created on Jul 24, 2009
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
package org.fest.swing.applet;

import static org.fest.assertions.Assertions.assertThat;

import java.applet.Applet;
import java.util.Enumeration;

import org.junit.Test;

/**
 * Tests for <code>{@link BasicAppletContext#getApplets()}</code>.
 *
 * @author Alex Ruiz
 * @author Yvonne Wang
 */
public class BasicAppletContext_getApplets_Test extends BasicAppletContext_TestCase {

  @Test
  public void should_always_return_empty_enumeration() {
    Enumeration<Applet> applets = context.getApplets();
    assertThat(applets.hasMoreElements()).isFalse();
    assertThat(applets.nextElement()).isNull();
  }
}
