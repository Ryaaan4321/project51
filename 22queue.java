class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> l0=new LinkedList<>();
        Queue<Integer> l1=new LinkedList<>();

        for(int student: students){
            if(student==0){
                l0.add(student);
            }else{
                l1.add(student);
            }
        }
	    
        int i=0;
        while(!(l0.isEmpty() && l1.isEmpty())){
            if(sandwiches[i]==0 && !l0.isEmpty())
                l0.poll();
            else if(sandwiches[i]==1 && !l1.isEmpty())
                l1.poll();
            else
                return l0.size() + l1.size();
                i++;
        }
                
            
           

            return 0;
        
        
    }




    public int countStudents2(int[] students, int[] sandwiches) {
        Queue<Integer> line = new LinkedList();
        for (int student: students) 
            line.add(student);
        
        int cycle = 0;
        int i = 0;
        while (!line.isEmpty()) {
			if (cycle > line.size())
                return line.size();
            int student = line.poll();
            if (student != sandwiches[i]) {
                line.add(student);
                cycle++;
            }
            else {
                cycle = 0;
                i++;
            }
        }
        return 0;
    }
}



    public int countStudents3(int[] students, int[] sandwiches) {
        int line0 = 0;
        int line1 = 0;
        for (int student: students) {
            if (student == 0)
                line0++;
            else
                line1++;
        }
        
        int i = 0;
        while (line0 > 0 || line1 > 0) {
            if (sandwiches[i] == 0 && line0 > 0)
                line0--;
            else if (sandwiches[i] == 1 && line1 > 0)
                line1--;
            else
                return line0 + line1;
            i++;
        }
        return 0;
    }
}
