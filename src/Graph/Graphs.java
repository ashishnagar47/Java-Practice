package Graph;

import java.util.*;

public class Graphs {
    public class Vertex{
        HashMap<String,Integer> nbrs=new HashMap<>();
    }

    HashMap<String,Vertex> vtcs;

    public Graphs(){
        vtcs=new HashMap<>();
    }

    public int numVertex(){//number of vertex
        return vtcs.size();
    }

    public boolean containvertex(String vname){
        return vtcs.containsKey(vname);
    }

    public void addvertex(String vname){
        Vertex vt=new Vertex();
        vtcs.put(vname,vt);
    }

    public void removeVertex(String vname){
        Vertex vtx=vtcs.get(vname);
        ArrayList<String> keys=new ArrayList<>(vtcs.keySet());

        for(String key:keys){
            Vertex nbrvtx=vtcs.get(key);
            nbrvtx.nbrs.remove(vname);
        }
        vtcs.remove(vname);
    }

    public int numEdges(){
        int count=0;

        ArrayList<String> keys=new ArrayList<>(vtcs.keySet());
        for(String key:keys){
            Vertex vertex=vtcs.get(key);
            count+=vertex.nbrs.size();
        }
        return count/2;
    }

    public boolean containEdges(String vname1,String vname2){
        Vertex vtx1=vtcs.get(vname1);
        Vertex vtx2=vtcs.get(vname2);

        if(vtx1==null || vtx2==null || !vtx1.nbrs.containsKey(vname2)){
            return false;
        }
        return true;
    }

    public void addEdges(String vname1,String vname2,int cost){
        Vertex vtx1=vtcs.get(vname1);
        Vertex vtx2=vtcs.get(vname2);

        if(vtx1==null || vtx2==null || vtx1.nbrs.containsKey(vname2)){
            return;
        }

        vtx1.nbrs.put(vname2,cost);
        vtx2.nbrs.put(vname1,cost);
    }

    public void removeEdge(String vname1,String vname2){
        Vertex vtx1=vtcs.get(vname1);
        Vertex vtx2=vtcs.get(vname2);

        if(vtx1==null || vtx2==null || !vtx1.nbrs.containsKey(vname2)){
            return;
        }

        vtx1.nbrs.remove(vname2);
        vtx2.nbrs.remove(vname1);
    }

    public void display(){
        ArrayList<String > keys=new ArrayList<>(vtcs.keySet());

        for(String key:keys){
            Vertex vtx=vtcs.get(key);
            System.out.println(key+ " ==> " + vtx.nbrs );
//            for(String padosi: vtx.nbrs.keySet()){
//                System.out.print(padosi+" ");
//            }
//            System.out.println();
        }
    }

    public boolean HasPath(String vname1,String vname2, HashMap<String,Boolean> visited){
        visited.put(vname1,true);

        if(containEdges(vname1,vname2)){
            return true;
        }

        Vertex vtx=vtcs.get(vname1);
        ArrayList<String> neighbours=new ArrayList<>(vtx.nbrs.keySet());

        for(String nbr:neighbours){
            if(!visited.containsKey(nbr) && HasPath(nbr,vname2,visited)){
                return true;
            }
        }
        return false;

    }

   public boolean bfs(String src,String dst){

        Queue<Vertex> queue= new LinkedList<>();
       Set<Vertex> visited=new HashSet<>();
       queue.add(vtcs.get(src));
       visited.add(vtcs.get(src));
       while (!queue.isEmpty()){
           Vertex temp1=queue.remove();
           for(String padosi:temp1.nbrs.keySet()){
                if(padosi==dst){
                    return true;
                }
                queue.add(temp1);
                visited.add(temp1);
           }
       }
       return false;
    }

}
