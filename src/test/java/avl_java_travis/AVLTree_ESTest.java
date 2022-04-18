/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 18 16:39:03 GMT 2022
 */

package test.java.avl_java_travis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import main.java.avl_java_travis.AVLTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AVLTree_ESTest extends AVLTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = 1058;
      aVLTree0.insert(1058);
      aVLTree0.insert(596);
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(596);
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree_Node1.left = aVLTree_Node0;
      aVLTree_Node1.key = 2917;
      aVLTree_Node1.left = aVLTree_Node0.left;
      aVLTree_Node1.left = aVLTree_Node0.left;
      aVLTree_Node1.left = aVLTree_Node0.left;
      // Undeclared exception!
      aVLTree0.find((-1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-456));
      aVLTree0.insert(0);
      aVLTree0.delete((-1));
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree0.delete(0);
      aVLTree0.insert((-1));
      aVLTree0.delete(0);
      aVLTree0.insert(325);
      aVLTree0.height();
      aVLTree0.delete(1);
      aVLTree0.find(325);
      aVLTree0.insert((-320));
      aVLTree0.delete(0);
      int int0 = aVLTree0.getBalance(aVLTree_Node0);
      assertEquals(2, aVLTree0.height());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-3397));
      aVLTree0.insert((-1));
      aVLTree0.insert((-3397));
      aVLTree0.insert(1077);
      aVLTree0.insert(0);
      aVLTree0.delete((-1));
      aVLTree0.delete(0);
      aVLTree0.delete((-1));
      aVLTree0.insert(0);
      aVLTree0.height();
      aVLTree0.insert((-1));
      // Undeclared exception!
      try { 
        aVLTree0.insert(1077);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("main.java.avl_java_travis.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      aVLTree0.delete(0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.find(0);
      aVLTree0.insert(0);
      aVLTree0.insert(1);
      aVLTree0.insert(1790);
      aVLTree0.getRoot();
      aVLTree0.delete(1790);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(1);
      aVLTree0.insert((-1074));
      aVLTree0.delete(1004);
      aVLTree0.insert(1004);
      aVLTree0.getRoot();
      aVLTree0.insert(1);
      aVLTree0.find((-1074));
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = (-2185);
      aVLTree0.delete((-2185));
      aVLTree0.getRoot();
      aVLTree0.height();
      aVLTree0.delete((-1));
      aVLTree0.insert((-2185));
      // Undeclared exception!
      try { 
        aVLTree0.insert((-2185));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("main.java.avl_java_travis.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(371);
      int int0 = 217;
      aVLTree0.insert(217);
      aVLTree0.insert(0);
      // Undeclared exception!
      try { 
        aVLTree0.insert(217);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("main.java.avl_java_travis.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(3830);
      aVLTree0.insert((-1));
      aVLTree0.insert(3809);
      aVLTree0.delete(1142);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = 0;
      aVLTree0.insert(0);
      aVLTree0.insert((-863));
      aVLTree0.insert(1513);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree_Node0.key = 0;
      aVLTree_Node0.key = (-863);
      aVLTree0.delete(1513);
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.insert(1513);
      aVLTree0.insert(int0);
      assertEquals(2, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      aVLTree0.delete((-1));
      aVLTree0.getRoot();
      aVLTree0.delete(0);
      aVLTree0.insert((-1));
      aVLTree0.delete(0);
      aVLTree0.insert(325);
      aVLTree0.height();
      aVLTree0.delete(1);
      aVLTree0.find(325);
      aVLTree0.insert((-320));
      aVLTree0.delete(0);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-4341));
      aVLTree0.find((-4341));
      aVLTree0.height();
      aVLTree0.getRoot();
      aVLTree0.insert(1);
      aVLTree0.delete(0);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(0);
      aVLTree0.insert(0);
      aVLTree0.delete(0);
      aVLTree0.insert((-1134));
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.delete(0);
      aVLTree0.height();
      aVLTree0.delete(0);
      assertEquals(0, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.find(0);
      aVLTree0.insert(0);
      aVLTree0.delete(0);
      aVLTree0.getRoot();
      aVLTree0.getRoot();
      aVLTree0.delete(0);
      aVLTree0.getRoot();
      assertEquals((-1), aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1344));
      aVLTree0.insert(1652);
      aVLTree0.delete(0);
      aVLTree0.find(1621);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(0);
      aVLTree0.insert((-464));
      AVLTree.Node aVLTree_Node1 = aVLTree0.new Node((-4015));
      aVLTree_Node0.key = 2247;
      aVLTree_Node1.height = 0;
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree_Node1.right = aVLTree_Node0;
      aVLTree_Node0.right = aVLTree_Node1;
      aVLTree_Node0.key = 2247;
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree_Node1.key = 808;
      aVLTree0.find(0);
      // Undeclared exception!
      try { 
        aVLTree0.delete(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.avl_java_travis.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1);
      aVLTree0.insert(0);
      // Undeclared exception!
      try { 
        aVLTree0.delete(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.avl_java_travis.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.getRoot();
      int int0 = aVLTree0.getBalance((AVLTree.Node) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1631));
      int int0 = aVLTree0.height();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = 361;
      aVLTree0.insert(361);
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(361);
      aVLTree_Node0.key = 1;
      aVLTree_Node0.right = null;
      aVLTree_Node0.key = 1;
      aVLTree_Node0.right = null;
      aVLTree_Node0.left = null;
      aVLTree0.insert(361);
      aVLTree_Node0.right.key = (-2661);
      aVLTree0.getBalance(aVLTree_Node0);
      // Undeclared exception!
      try { 
        aVLTree0.insert(1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("main.java.avl_java_travis.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = aVLTree0.height();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1));
      aVLTree0.delete(1972);
      assertEquals(0, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-4102));
      aVLTree0.insert(2079);
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(195);
      aVLTree0.getRoot();
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1);
      aVLTree0.delete((-2116));
      aVLTree0.insert(0);
      aVLTree0.find(0);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(877);
      aVLTree0.find((-1));
      // Undeclared exception!
      try { 
        aVLTree0.insert(877);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("main.java.avl_java_travis.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(5058);
      assertNull(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-3397));
      aVLTree0.insert((-1));
      aVLTree0.insert((-3397));
      aVLTree0.insert(1077);
      aVLTree0.insert(0);
      aVLTree0.delete((-1));
      aVLTree0.delete(0);
      aVLTree0.delete((-1));
      aVLTree0.insert(0);
      aVLTree0.height();
      // Undeclared exception!
      try { 
        aVLTree0.insert(1077);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("main.java.avl_java_travis.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(1);
      aVLTree0.find((-835));
      aVLTree0.insert((-835));
      aVLTree0.insert((-17));
      aVLTree0.delete((-835));
      aVLTree0.height();
      aVLTree0.insert(0);
      aVLTree0.insert(1);
      aVLTree0.delete(1);
      aVLTree0.insert((-2149));
      aVLTree0.getBalance((AVLTree.Node) null);
      aVLTree0.find(1);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1074));
      aVLTree0.insert(1004);
      aVLTree0.getRoot();
      aVLTree0.insert((-21));
      aVLTree0.find((-1074));
      assertEquals(1, aVLTree0.height());
  }
}
