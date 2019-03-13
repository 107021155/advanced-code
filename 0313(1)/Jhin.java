public class Jhin extends Hero {
    public Jhin(){
        description = "酷炫大師 燼";
        hp = 555f;
        mp = 290f;
        attack = 61f;
        speed = 315;
    }
    public float[] passiveAttack(){
        float data[] = {10f,11f,5f}; //hp,mp,speed
        return data;
    }
    public float[] qAttack(){
        float data[] = {15f,5f,2f};
        return data;
    }
    public float[] wAttack(){
        float data[] = {15f,20f,3f};
        return data;
    }
    public float[] eAttack(){
        float data[] = {10f,10f,0.5f};
        return data;
    }
    public float[] rAttack(){
        float data[] = {50f,30f,0.5f};
        return data;
    }
}
