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
            ui.textAlign(startUI.CENTER,startUI.CENTER);
            ui.text("Press s for song list",ui.width/2, ui.height/1.75f );

            ui.textSize(60);
            ui.textAlign(startUI.CENTER,startUI.TOP);
            ui.text("Press space to play",ui.width/2, ui.height/1.5f );
        }
        else if(current==1)
        {
            ui.textSize(100);
            ui.textAlign(startUI.CENTER,startUI.TOP);
            ui.text("Song List",ui.width/2, ui.height/18);

            ui.textSize(25);
            ui.textAlign(startUI.CENTER,startUI.CENTER);
            ui.text("1.(Song Without Words) — 5:06",ui.width/2, ui.height/4);

            ui.textSize(25);
            ui.textAlign(startUI.CENTER,startUI.CENTER);
            ui.text("2.(Star Called Sun) — 3:45",ui.width/2, ui.height/4+50);

            ui.textSize(25);
            ui.textAlign(startUI.CENTER,startUI.CENTER);
            ui.text("3.(Unhappy Song) — 4:18",ui.width/2, ui.height/4+100);

            ui.textSize(25);
            ui.textAlign(startUI.CENTER,startUI.CENTER);
            ui.text("4.(Tale) — 5:58",ui.width/2, ui.height/4+150);

            ui.textSize(25);
            ui.textAlign(startUI.CENTER,startUI.CENTER);
            ui.text("5.(Space for a Step Forward) — 3:39",ui.width/2, ui.height/4+200);

            ui.textSize(25);
            ui.textAlign(startUI.CENTER,startUI.CENTER);
            ui.text("6.(Pack of Cigarettes) — 4:28",ui.width/2, ui.height/4+250);

            ui.textSize(25);
            ui.textAlign(startUI.CENTER,startUI.CENTER);
            ui.text("7.(Knock) — 3:50",ui.width/2, ui.height/4+300);

            ui.textSize(25);
            ui.textAlign(startUI.CENTER,startUI.CENTER);
            ui.text("8.(Sadness) — 5:32",ui.width/2, ui.height/4+350);

            ui.textSize(25);
            ui.textAlign(startUI.CENTER,startUI.CENTER);
            ui.text("9.(April) — 4:40",ui.width/2, ui.height/4+400);

            ui.textSize(20);
            ui.textAlign(startUI.CENTER,startUI.TOP);
            ui.text("Press w to return to main menu",ui.width/2, ui.height/1.25f );
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
            
            ui.textSize(20);
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