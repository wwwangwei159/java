package javatest.suanfa.Erchashu;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Erchashulength {

	
	
	public static int leftlength = 0;
	public static int rightlength = 0;
	public static int length = 0;
	
	public static int dept(TreeNode node){
		if(node!=null){
			length = 1;
		}
		//如果下面的节点为null,或者左右几点为null，直接返回
		if((node==null)||(node.getLeftChild()==null&&node.getRightChild()==null)){
			return  leftlength>rightlength?leftlength:rightlength;
		//遍历左侧的树结构
		}else if(node.getLeftChild()!=null&&node.getRightChild()==null){
			leftlength++;
			return dept(node.getLeftChild());
			//遍历右侧的树结构
		}else if(node.getLeftChild()==null&&node.getRightChild()!=null){
			rightlength++;
			return dept(node.getRightChild());
			//如果2侧都有树
		}else{
			 rightlength++;
			 leftlength++;
			 dept(node.getLeftChild());
			 dept(node.getRightChild());
			return leftlength>rightlength?leftlength:rightlength;
		}
		
	}
	
	public static void bianli(TreeNode node){
		if(node!=null){
			System.out.println("--------------"+node.getVal());  //最先遍历根节点
			bianli(node.getLeftChild());
			bianli(node.getRightChild());
			System.out.println("--------------"+node.getVal());  //最后遍历根节点。
		}
	}
	
	public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<Integer>();

        if (root != null) {
            Deque<Object> stack = new LinkedList<Object>();
            stack.add(root);

            while (!stack.isEmpty()) {
                TreeNode node = (TreeNode) stack.removeLast();
                result.add(node.val);

                if (node.getRightChild() != null) {
                    stack.add(node.getRightChild());
                }
                if (node.getLeftChild() != null) {
                    stack.add(node.getLeftChild());
                }
            }
        }

        return result;
    }
	
	
	public static void depthOrderTraverse(TreeNode root) {
		if (root == null) {
			return;
		}
		LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			System.out.print(node.val+"  ");
			if (node.getRightChild() != null) {
				stack.push(node.getRightChild());
			}
			if (node.getLeftChild() != null) {
				stack.push(node.getLeftChild());
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node = new TreeNode(1);
		TreeNode node21 = new TreeNode(21);
		TreeNode node22 = new TreeNode(22);
		TreeNode node31 = new TreeNode(31);
		TreeNode node32 = new TreeNode(32);
		TreeNode node33 = new TreeNode(33);
		node.setLeftChild(node21);
		node.setRightChild(node22);
		node21.setLeftChild(node31);
		node21.setRightChild(node32);
		node22.setRightChild(node33);
		//dept(node);
		//bianli(node);
		 List<Integer> result = preorderTraversal(node);
		 System.out.println("---------"+result.get(0)+"-------"+result.get(1)+"------------"+result.get(2));
		System.out.println(length+"----------"+leftlength+"--"+rightlength);
		System.out.println(length+leftlength);
		
		
		//深度遍历：
		depthOrderTraverse(node);

	}

}
