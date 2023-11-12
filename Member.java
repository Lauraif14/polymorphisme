
public abstract class Member implements CanGetDiskon, CanGetPoin{
    public Integer poin = 1;
    public Integer totalBayar = 0;
    public Double ongkir = 0.0 ;  

    public Integer redeemPoin(Integer hargaSouvenir){
        this.poin = this.poin - hargaSouvenir;
        return this.poin;
    }

    protected Integer getBonusPoin(Integer totalBayar){
        Integer poin = totalBayar - (totalBayar / 10000);
        return poin;
    }

    public Integer getPoin(){
            Integer x = 0;
            if (this.totalBayar >= 10000){
                for (Integer a = 10000; a <= this.totalBayar;){
                    this.totalBayar = this.totalBayar - 10000;
                    x++;
                }
                this.poin = this.poin + x;
            }
        
        return this.poin; 
    }


}



