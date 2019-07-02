         /**
         * Main class of the Java program.
         */
        import java.util.*;
        import java.io.*;
        
     
   
        
    
        public class Main {
   
   static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[1000010]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    }
    
    public static final int prime = 1000000007;
    
    public static void print(int[] arr){
        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void printlist(ArrayList<Integer> arr){
        for(int i = 0 ;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println("");
    }
    
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    
    public static int[] reversesort(int[] ia){
        ia = Arrays.stream(ia).
        boxed().
        sorted((a, b) -> b.compareTo(a)). // sort descending
        mapToInt(i -> i).
        toArray();
        return ia;
    }
    
  

            public static void main(String[] args) throws IOException {
                Reader sc = new Reader();
                int tc = sc.nextInt();
                for(int z = 0;z<tc;z++){
                    int N = sc.nextInt();
                    int[] arr = new int[N];
                    long till = 0;
                    for(int i = 0;i<N;i++){
                        arr[i] = sc.nextInt();
                        till += (long)arr[i];
                    }
                    int K = sc.nextInt();
                    int X = sc.nextInt();
                    if(X==0){
                        System.out.println(till);
                    }else{
                        int[] chng = new int[N];
                        int chngpos = 0,chngneg = 0;
                        long poschng = 0;
                        long negchng = 0;
                        for(int i = 0;i<N;i++){
                            chng[i] = (arr[i]^X) - arr[i];
                            if(chng[i]>=0){
                                chngpos++;
                                poschng += (long)chng[i];
                            }else{
                                chngneg++;
                                negchng += (long)chng[i];
                            }
                        }
                        chng = reversesort(chng);
                        if(K==N){
                            if(poschng+negchng>=0){
                                System.out.println((till+poschng+negchng));
                            }else{
                                System.out.println(till);
                            }
                        }else{
                            if(K%2==1){
                                System.out.println(till+poschng);
                            }else{
                                if(chngpos%2==0){
                                     System.out.println(till+poschng);
                                }else{
                                    long temp = 0;
                                    for(int i = 0;i<N-1;i+=2){
                                        if(chng[i]+chng[i+1]>=0){
                                            temp += (long)chng[i]+chng[i+1];
                                        }else{
                                            break;
                                        }
                                    }
                                    System.out.println(till+temp);
                                }
                            }
                        }
                    }
                    
                }
                
            }
        } 