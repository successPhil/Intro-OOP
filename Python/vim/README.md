<h1>How to quit vim</h1>
<code>:wq</code> is two commands (write) and (quit). Which in most cases will likely be what you are trying to do<br/>
<br/>
Why am I telling you this before telling you about vim? Well lets just say it is one of the reasons some people find it uncomfortable, as they edit some code and cannot remember how to save and quit
<br/>
<br/>
If you end up editing your code and do not wish to save it like that, you can simply force quit with <code>:q!</code>

**This only works by the way, provided you are in normal mode**

<h2>Ok so what is vim and why use it</h2>
It is a screen-based text editor meaning you can edit text (or code) directly from your terminal. At some point you will need to fix or create code, that is not directly on your local machine, in which case you will simply install vim if necessary and use to it to finish up whatever task you are working on
<br/>
<br/>
<h3>What you need to know right now</h3>
If you google a vim cheat sheet, or look at some of the resources at the end of this document. You will get an understanding of why I did my best to limit the commands. Focus on being able to edit and save code, you can learn the fancy stuff later.
<ul>
  <li>
    Normal Mode - This is the default mode when you open vim and it is the mode you need to be in when you quit or save. This is the mode you <strong>should</strong> be in when you are simply navigating around text
  </li>
  <li>
    Insert Mode - To enter insert mode you simply press "i" while in normal mode, while you are in insert mode you can freely type just any other text editor, and you press "esc" to go back to normal mode
  </li>
</ul>
<br/>
<h3>Moving in Normal Mode</h3>
<ul>
  <li>
    <code>h</code> will move your cursor <strong>left</strong>
  </li>
  
  <li>
    <code>l</code> will move your cursor <strong>right</strong>
  </li>
  
  <li>
    <code>k</code> will move your cursor <strong>up</strong>
  </li>
  
  <li>
    <code>j</code> will move your cursor <strong>down</strong>
  </li>
  <li>
    You can also use your arrow keys
  </li>
  <li>
    <code>:wq</code> to save and quit
  </li>
  <li>
    <code>:q!</code> to force quit <strong>without</strong> saving
  </li>
  <li>
    <code>SHIFT + ZZ</code> Another way to <strong>save and quit</strong> if you find that easier than <code>:wq</code>
  </li>
</ul>

<h3>Insert Mode</h3>
<ul>
  <li>
    <code>i</code> will let you enter insert mode
  </li>
  <li>
    <code>esc</code> will let you exit insert mode
  </li>
</ul>

<h4>Lets do something with vim</h4>

Open up a terminal and go ahead and run:
```
vim myFirstVimFile
```

This is going to create a file called `myFirstVimFile` and you will by default be in `Normal Mode`
<br/>
Press `i` to enter `Insert Mode` and write some text, or copy something like the following:

```
Welcome to the world of Vim!

You have just entered a new realm of text editing, where the power of the keyboard is at your fingertips! No more clicking and dragging with a mouse — Vim lets you control your files with speed and precision.

In this file, you are learning how to navigate, edit, and save your work using Vim's powerful features. The commands you type may seem strange at first, but soon you will be able to edit with lightning speed.

Remember, Vim is all about muscle memory and practice. Each time you use it, you'll get better and faster. 

Now, before you get carried away, let's take a moment to appreciate the magic of Vim. You've already learned how to:

- Enter Insert Mode to type text.
- Exit Insert Mode to perform powerful commands.
- Save your work and quit Vim without breaking a sweat.

Congratulations! You have just taken your first step towards becoming a Vim master.

Keep practicing and soon you'll be editing text faster than ever before!

Happy Vimming!

```

Once you have typed out some text or pasted in the example, go ahead and press `esc` to exit `Insert Mode` and return to `Normal Mode`
<br/>
<br/>
Now that you are in normal mode, you can save and quit the file with `:wq` or `SHIFT + ZZ`
<br/>
<br/>
Next go ahead and list the files in your current directory by typing `ls` in your terminal
<br/>
<br/>
You should notice that you have a file named `myFirstVimFile` which is the file we just created and edited from the terminal
<br/>
You can check the contents of this file by typing `cat myFirstVimFile` in your terminal
<br/>
<br/>
Your terminal should display the contents of the file, which is what you either typed or pasted in before saving and quitting
<br/>
<br/>
If you copied the text your terminal window may be cluttered. You can execute `clear` in your terminal to get rid of the text now that we have verified it was saved properly
<br/>
<br/>
<br/>
We just `created` a file, `edited` the contents of the file, `saved` the file, and in this case simply checked its contents. Consider that this is all you need to know how to do to create a python file, write some code, and maybe `execute` the file instead of displaying the content
<br/>
<br/>
Lets get rid of the file we created, from your terminal run `rm myFirstVimFile` and notice if you now run `ls` you will no longer see the file we created

<h3>Now make a python file</h3>
Like before we can type <code>vi</code> and provide a file name like <code>hello.py</code>
<br>
Copy in the following code

```
def hello():
    print("Hello World from vim!")
```
<h4>Making things slightly more pretty</h4>
After you have copied in your code, go ahead exit <code>insert mode</code>
<br/>
<br/>

In `normal mode` type `:syntax on` and notice you will get pretty highlighting in your vim editor
<br/>

Next type `:set number` and you should notice line numbers are now displayed. Pretty cool huh
<br/>
Use `:wq` or `SHIFT + ZZ` to save and quit the file, and now re-open it with `vim hello.py`
<br/>
<br/>
Sadly it appears that our pretty changes do not persist. Have no worries we can fix that
<br/>
Exit back out of your python file using a valid command for normal mode
<br/>
In your terminal, go ahead and create or edit a new file using `vi ~/.vimrc`
Enter insert mode
and add `:syntax on` to line one,
then `:set number` to line two
Save and exit your vimrc file and go back into your python file
<br/>
You should now see the syntax highlighting and line numbers are there again, amazing

<br/>

Make sure you are in normal mode and press `2yy` and then `SHIFT+P`
<br/>

If you did this correctly you now have two hello functions
<br/>

Now press `u` and you will undo the copy paste you just performed, if you need to redo you can press `ctrl + r`
<br/>

You can also cut by doing `2dd` and `p` will paste below your cursor, while `SHIFT+P` will paste at your cursor

Ok don't worry too much about getting good with these commands, just know that they exist and can be used in several different ways

format your python file to have two hello functions, or delete it all and copy this in if your head is spinning

```
 def hello():
     print("Hello World from vim!")
 def hello():
     print("Hello World from vim!")

```

Now modify those functions to be `add` and `subtract` functions

```
def add(x,y):
    return x + y
def subtract(x,y):
    return x - y

print(add(3,2)) // calling add with values x=3, y=2
print(subtract(6,4)) // calling subtract with values x=6, y=4
```

Once you have updated the code, go ahead and make sure you are in `normal mode` and this time, just `:w`

You should still see your python code, and maybe a message like "hello.py" 8L... written

still in `normal mode` go ahead and press `CTRL + Z`

Like magic you are back in your terminal. Go ahead and try `python hello.py` or `python3 hello.py` depending on your setup

If you see the printed values from our function calls (5 and then 2) then you successfully edited your code and executed it!

Now what about vim? We never actually exited, in your terminal go ahead and type `fg`

And we are back where we left off in vim before pressing `CTRL + Z`

See if you can use `u` to bring the file back to our hello function, and call the hello function


I know we just ran through a what seems like a lot of vim commands, do not worry I have formatted some of the commands below. You do not need to know these but they can be helpful to know they exist

| **Command**                  | **Description**                                                   |
|------------------------------|-------------------------------------------------------------------|
| `(line number) + Shift + G`  | Jump to a specific line number.                                  |
| `a`                          | Enter **Insert mode** in front of the cursor position.           |
| `yy`                         | Copy the current line.                                           |
| `(number of lines) yy`       | Copy a certain number of lines (e.g., `3yy` copies 3 lines).     |
| `dd`                         | Cut the current line.                                            |
| `(number of lines) dd`       | Cut a certain number of lines (e.g., `3dd` cuts 3 lines).        |
| `p`                          | Paste the content below the cursor.                              |
| `P`                          | Paste the content at the cursor position.                        |
| `u`                          | Undo the last action.                                            |
| `Ctrl + r`                   | Redo the last undone action.                                     |
| `Ctrl + z`                   | Run Vim in the background.                                       |
| `fg`                         | Bring Vim back to the foreground.                                |
| `Shift + $`                  | Move the cursor to the end of the current line.                  |
| `Shift + ^`                  | Move the cursor to the beginning of the current line.            |


Use this chart as a reference or copy down what you feel like you will likely use in the future. Mastering vim is arguably not that important, but being able to edit code directly in a terminal has its benefits

If you are looking at this and it seems like a lot, just continue with the OOP assignments using whatever editor you feel comfortable in. The point of showing this material is to give you a small chunk of useful commands that you can practice with throughout exercises. But if you feel it is to time consuming or confusing, just come back to it at a later date
