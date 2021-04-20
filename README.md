# Music Visualiser Project

(Currently writing this!Still need to get the files up to code)
Name:Daneill Stibayev

Student Number:C19307316 

## Instructions
- Fork this repository and use it a starter project for your assignment
- Create a new package named your student number and put all your code in this package.
- You should start by creating a subclass of ie.tudublin.Visual
- There is an example visualiser called MyVisual in the example package
- Check out the WaveForm and AudioBandsVisual for examples of how to call the Processing functions from other classes that are not subclasses of PApplet

# Description of the assignment

My assignment is a music visualiser that changes how it looks based on the music played with two visualisers that are displayed based on where in the song you are. 
I included rewind and song selection features, as I noticed that
hadn't been done that often with one song being emphasied, whereas music visualisers should aim to make any type of music to become beautiful.

# Instructions

All you need to do is press space in order to play music and if you want to change songs your pause and press any number from 1-9 and if you want to rewind just 
press r. You have the options displayed in the controls section of the mneu.


# How it works

It uses the audio buffer and audio smoothed bands to determine the size and colours of the two visualisers, I included.

# What I am most proud of in the assignment

Personally, I am quite proud of how the sun turned out, I had a hard time trying to figure out how to have the audio buffers surround it and figuring out 
how to have the colours change based on the song. Overall, I am proud of the assignment, as I had a real hard time figuring out what to display, I am not a creative person when it comes
to art, however I constantly tried new things to show which you can find in the testing java file, 
which I decided not to include in order to not soil the experience of the two visualisers that I can proudly display.

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

