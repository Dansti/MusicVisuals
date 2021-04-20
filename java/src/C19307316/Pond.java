package C19307316;


public class Pond
{
    //CleanUp
    startUI ui;

    //Screen
    float height;
    float width;

    Falling[] falling;
    int shapeamount = 10;

    public Pond(startUI ui)
    {
        this.ui = ui;
        this.width = ui.width;
        this.height = ui.height;

        falling = new Falling[shapeamount];

        for (int i=0;i<shapeamount;i++) 
        {
            falling[i] = new Falling(i);
        }

    }

    public void render()
    {

        
        for(int i=0;i<shapeamount;i++)
        {
            falling[i].move();
            falling[i].display(); 
        }

    }


    public class Falling
    {
        int sh;
        float x,y,z;

        public Falling(int i)
        {
            this.sh = i;
            x = 0;
            y = 0;
            z = 100;
        }
        public void display()
        {
            if(sh%2==0)
            {
                ui.ellipse(x,y,z,z);
            }
            else
            {
                ui.rect(x,y,z,z);
            }
            ui.translate(200,0,0);
        }
        public void move()
        {  
            for(int i=0;i<ui.getSmoothedBands().length;i++)
            {   
                y++;
                z=ui.getSmoothedBands()[i];
                if(y>height)
                {
                    y=0;
                }
            }
        }
    }



}