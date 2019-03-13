import java.util.Random;

public class stone extends Monster{
    private String name;
    public  stone(){
        super.count++;
        hp = 500f;
        attack = 100f;
        de = 5f;
        Random rand = new Random(System.currentTimeMillis());
        x = rand.nextInt(1024);
        y = rand.nextInt(1024);
        name = "Stone"+Integer.toString(Monster.getMonsterCount());
    }
    @Override
    public float[] attack(){
        float data[]={100f,0f,10f};
        return data;
        }
        public void showInfo{
        System.out.println(name);
        super.showInfo;
    }
}
