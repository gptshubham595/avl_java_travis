package test.java.avl_java_travis;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.avl_java_travis.AVLTree;

public class AVLTreeTest {

	@Test
	public void testRoot() {
		// this array in this order allows to pass in all branches
		// of the insertion algorithm
		int[] array = { 10, 20, 30, 40, 50, 25 };
		AVLTree tree = new AVLTree();

		for (int i = 0; i < array.length; i++) {
			tree.insert(array[i]);
		}
		assertEquals(tree.getRoot(), tree.find(30));
	}

	@Test
	public void testTreeHieght() {
		// this array in this order allows to pass in all branches
		// of the insertion algorithm
		int[] array = { 10, 20, 30, 40, 50, 25 };
		AVLTree tree = new AVLTree();

		for (int i = 0; i < array.length; i++) {
			tree.insert(array[i]);
		}

		assertEquals(tree.height(), 2);
	}

}