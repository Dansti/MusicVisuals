# Music Visualiser Project

Name:Daneill Stibayev

Student Number:C19307316 

# Description of the assignment

My assignment is a music visualiser that changes how it looks based on the music played with two visualisers that are displayed based on where in the song you are. 
I included rewind and song selection features, as I noticed that
hadn't been done that often with one song being emphasied, whereas music visualisers should aim to make any type of music to become beautiful.

# Instructions

- Fork the Repository
- Open the MusicVisuals Folder in My Visual Studio 
- Press F5
- Instructions will appear on the menu
- You can press space to play music or q to view controls
- You can switch songs with 1-9 when paused 
- You can rewind songs with the r button


# How it works

The main program launches the startUI which inherits values from audio that allows it to get the AudioBuffer and such. It sets up the default conditions and loads the menu with the sound
and instructions. After that it lets you play the audio which is starts by placing "a star by the name of the sun" as it's first song(This can be changed by pausing the song and selecting
any of the songs from 1-9. In the sun and build java files you can see how it determines the shapes and colours of the visuals based on the length of the song, audio buffer and smoothed bands.
I also used some basics in geometry to rotate the shapes to make appealing visuals based on the lerpedbuffer and height of the screen to randomise the new look of the visuals for different scree
types.

# What I am most proud of in the assignment

Personally, I am quite proud of how the sun turned out, I had a hard time trying to figure out how to have the audio buffers surround it and figuring out 
how to have the colours change based on the song.
I dabbled a lot in 3d modelling trying to create things like moving trains,a gyroscope and falling shapes, none of which I decided to use, mainly due to the reasons for them
not looking visually appealing and my lack of ability in creating visually appearing art.Overall, I am proud of the assignment, as I had a real hard time figuring out what to display, as I mentioned
previously,I am not a creative person when it comes to art, 
however I constantly tried new things to show which you can find in the testing and pond java files, 
which I decided not to display in the video, in order to not soil the experience of the two visualisers that I can proudly display.


# Youtube video

[![YouTube](https://img.youtube.com/vi/eVtPxU9jzoA/hqdefault.jpg)](https://youtu.be/eVtPxU9jzoA)


