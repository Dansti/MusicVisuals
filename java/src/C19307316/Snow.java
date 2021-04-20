package C19307316;

public class Snow
{

    startUI ui;
    float x, y, z;
    int snowing = 40;

    public Snow(startUI ui) 
    {
        this.ui = ui;
    }

    public void render()
    {
        Snowflake[] snowflake = new Snowflake[snowing];

        for(int i = 0; i< snowing; i++)
        {
            snowflake[i] = new Snowflake(ui.random(ui.width),ui.random(ui.height), 5);
            ui.ellipse(snowflake[i].x, snowflake[i].y, snowflake[i].z, snowflake[i].z);
        }

    }

    public void menu(int current)
    {
        if(current==0)
        {
            ui.textSize(100);
            ui.textAlign(startUI.CENTER,startUI.BOTTOM);
            ui.text("Welcome",ui.width/2, ui.height/3);

            ui.textSize(60);
            ui.textAlign(startUI.CENTER,startUI.CENTER);
            ui.text("Press q for controls",ui.width/2, ui.height/2 );

            ui.textSize(60);
            ui.textAlign(startUI.CENTER,startUI.TOP);
            ui.text("Press space to play",ui.width/2, ui.height/1.5f );
        }
        else
        {
            ui.textSize(100);
            ui.textAlign(startUI.CENTER,startUI.BOTTOM);
            ui.text("Controls",ui.width/2, ui.height/3);

            ui.textSize(60);
            ui.textAlign(startUI.CENTER,startUI.CENTER);
            ui.text("Change songs while paused: 1-9",ui.width/2, ui.height/2 );

            ui.textSize(60);
            ui.textAlign(startUI.CENTER,startUI.TOP);
            ui.text("Rewind song: r",ui.width/2, ui.height/1.5f );
            
            ui.textSize(40);
            ui.textAlign(startUI.CENTER,startUI.TOP);
            ui.text("Press w to return to main menu",ui.width/2, ui.height/1.25f );
            
        }

    }

    public class Snowflake
    {
        float x, y, z;
    
        public Snowflake(float x, float y, float z)
        {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }   

}