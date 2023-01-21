public static void breadthFirstSearch(Node root){
        if(root==null){
            return ;
        }
        Queue<Node> allValues= new LinkedList<>();
        allValues.add(root);
        while(!allValues.isEmpty()){
            Node node= allValues.poll();
            System.out.println(node.data);
            if(node.left!=null) allValues.add(node.left);
            if(node.right!=null) allValues.add(node.right);
        }
    }
