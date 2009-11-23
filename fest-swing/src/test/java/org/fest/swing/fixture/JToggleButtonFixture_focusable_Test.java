/*
 * Created on Nov 19, 2009
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
 * Copyright @2009 the original author or authors.
 */
package org.fest.swing.fixture;

import static org.easymock.classextension.EasyMock.createMock;
import static org.fest.swing.test.builder.JToggleButtons.toggleButton;

import javax.swing.JToggleButton;

import org.fest.swing.driver.AbstractButtonDriver;
import org.junit.BeforeClass;

/**
 * Tests for methods in <code>{@link JToggleButtonFixture}</code> that are inherited from
 * <code>{@link FocusableComponentFixture}</code>.
 *
 * @author Yvonne Wang
 * @author Alex Ruiz
 */
public class JToggleButtonFixture_focusable_Test extends FocusableComponentFixture_TestCase<JToggleButton> {

  private static JToggleButton target;

  private AbstractButtonDriver driver;
  private JToggleButtonFixture fixture;

  @BeforeClass
  public static void setUpTarget() {
    target = toggleButton().createNew();
  }

  void onSetUp() {
    driver = createMock(AbstractButtonDriver.class);
    fixture = new JToggleButtonFixture(robot(), target);
    fixture.driver(driver);
  }

  AbstractButtonDriver driver() {  return driver; }
  JToggleButton target() { return target; }
  JToggleButtonFixture fixture() { return fixture; }
}