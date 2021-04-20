package C19307316;

public class startUI extends Audio
{
    Sun sun;
    Snow snow;
    Build build;
    Pond pond;

    int menusystem=0;

    public void settings()
    {
        //size(1024,1024,P3D);
        fullScreen(P3D,SPAN);
    }
    
    public void setup()
    {
        colorMode(HSB);
        startMinim();
        loadAudio("snow.mp3");
        getAudioPlayer().loop();
        sun = new Sun(this);
        snow = new Snow(this);
        build = new Build(this);
        pond = new Pond(this);
        
    }

    public void keyPressed()
    {
        if(keyCode==' ')
        {
            if(getAudioPlayer().isLooping())
            {
                getAudioPlayer().pause();
                loadAudio("zvezda.mp3");
            }
            if(getAudioPlayer().isPlaying())
            {
                getAudioPlayer().pause();
            }//end if
            else
            {
                getAudioPlayer().play();
            }//end else
        } 

        if(!getAudioPlayer().isPlaying())
        {
            if(keyCode=='1')
            {
                loadAudio("pesnya.mp3");   
            }//end if
            if(keyCode=='2')
            {
                loadAudio("zvezda.mp3");   
            }//end if
            if(keyCode=='3')
            {
                loadAudio("neveselaya.mp3");   
            }//end if
            if(keyCode=='4')
            {
                loadAudio("skazka.mp3");   
            }//end if
            if(keyCode=='5')
            {
                loadAudio("mesto.mp3");   
            }//end if
            if(keyCode=='6')
            {
                loadAudio("pachka.mp3");   
            }//end if
            if(keyCode=='7')
            {
                loadAudio("stuk.mp3");   
            }//end if
            if(keyCode=='8')
            {
                loadAudio("pechal.mp3");   
            }//end if
            if(keyCode=='9')
            {
                loadAudio("april.mp3");   
            }//end if
        }

        if(key=='q')
        {
            menusystem=1;
        }
        if(key=='w')
        {
            menusystem=0;
        }
        if(key=='r')
        {
            getAudioPlayer().rewind();
        }

    }

    public void draw()
    {

        background(0);
        try
        {
            // Call this if you want to use FFT data
            calculateFFT(); 
        }
        catch(AudioException e)
        {
            e.printStackTrace();
        }
        // Call this is you want to use frequency bands
        calculateFrequencyBands(); 

        // Call this is you want to get the average amplitude
        calculateAverageAmplitude(); 

        if(!getAudioPlayer().isLooping())
        {
            if(getAudioPlayer().isPlaying())
            {
                if(getAudioPosition()<=getAudioLength()/2)
                {
                    sun.render();
                }
                else if(getAudioPosition()<=getAudioLength()/2*2)
                {
                    build.render();
                }
            }
        }
        else
        {
            snow.render();
            snow.menu(menusystem);
        }

    }

    
}