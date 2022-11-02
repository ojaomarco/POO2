

public class Multiplos implements Runnable{
    private int n;
    private long soma;
    public long getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

    private int count=0;
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Multiplos(int n){
        this.n=n;
    }

    @Override
    public void run() {
        for(int i =n; i<5000000;i+=n){
            if(i%n==0){
                count++;
                soma+=i;
            }
        }
        System.out.println("Multiplos de "+n+" ate 5kk:"+count);
        System.out.println("Soma de "+n+" ate 5kk: "+soma);
    }
    
}
