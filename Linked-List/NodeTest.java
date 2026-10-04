public class NodeTest {
    int data;
    NodeTest next;

    public NodeTest(int data){
        this.data= data;
    }
    public NodeTest( int data, NodeTest next){
        this(data);
        this.next=next;
    }
    public static NodeTest insert(NodeTest start, int x){
        if(start==null || start.data>x){
            start = new NodeTest(x,start);
            return start;
        }
        NodeTest p= start;
        while ( p.next!=null){
            if(p.next.data>x) break;

            p=p.next;
        }
        p.next=new NodeTest(x,p.next);
        return start;

    }
    public static void main(String[] args) {
       NodeTest list1= null;
       for(int i=1; i<=10; i++){
        list1 = insert(list1, i);

       } 

       NodeTest list2 = null;
       for(int i=100; i<=105; i++){
        list2= insert(list2, i);

       }

       int sum1=0, sum2=0;
       for( NodeTest i= list1 ; i!=null ; i=i.next){
        sum1+= i.data;
       }
       for( NodeTest j= list2 ; j!=null ; j=j.next){
        sum2+= j.data;
       }
       int total = sum1+ sum2;
       System.out.println("The sum of 2 lists: "+ total);

       for( NodeTest i = list1; i!= null ; i=i.next){
        if(i.data % 2 ==0 ){
            System.out.println(i.data);
        }
       }

     int x=104, y=2000;
     for(NodeTest j= list2; j.next!=null; j=j.next ){
        if(j.data==x) {
            j.data = y;
        }
     }
     int[] array1 = new int[10];
     int i=0;
     for(NodeTest j= list1; j!=null; j=j.next){
        array1[i]= j.data;
        i++;
     }
     NodeTest list3 = new NodeTest(array1[9]);
     NodeTest p= list3;
     for(int k=8; k>=0; k-- ){
        p.next=new NodeTest(array1[k]);
        p=p.next;
     }

    }
}
