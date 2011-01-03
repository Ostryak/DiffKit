/**
 * Copyright 2010 Joseph Panico
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.diffkit.diff.sns.tst



import org.diffkit.diff.sns.DKAbstractSheet;

import groovy.util.GroovyTestCase;


/**
 * @author jpanico
 */
public class TestAbstractSheet extends GroovyTestCase {
   
   
   public void testDefaultColumnName(){
      assert ! DKAbstractSheet.getDefaultColumnName(-1)
      assert DKAbstractSheet.getDefaultColumnName(0) == "A"
      assert DKAbstractSheet.getDefaultColumnName(1) == "B"
      assert DKAbstractSheet.getDefaultColumnName(25) == "Z"
      assert DKAbstractSheet.getDefaultColumnName(26) == "AA"
      assert DKAbstractSheet.getDefaultColumnName(51) == "AZ"
      assert DKAbstractSheet.getDefaultColumnName(52) == "BA"
      assert DKAbstractSheet.getDefaultColumnName(77) == "BZ"
   }
}
