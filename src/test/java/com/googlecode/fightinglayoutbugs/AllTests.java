/*
 * Copyright 2009-2011 Michael Tamm
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.googlecode.fightinglayoutbugs;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Michael Tamm
 */
@RunWith(Suite.class)
@SuiteClasses({
    AllUnitTests.class,
    AllTestsUsingFirefoxDriver.class,
    AllTestsUsingInternetExplorerDriver.class,
    AllTestsUsingRemoteWebDriverWithFirefox.class,
    AllTestsUsingDefaultSeleniumWithFirefox.class,
    AllTestsUsingChromeDriver.class
})
public class AllTests {}
