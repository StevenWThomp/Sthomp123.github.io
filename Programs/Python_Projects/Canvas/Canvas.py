#!/usr/bin/env python3
# Tkinter Drawing Canvas
# Steven Thompson
# 3/22/2018

"""" Drawing canvas made with tkinter """

from tkinter import *


class Application(Frame):
    """ Frame with a canvas that holds events """

    def __init__(self, master):
        """ Initialize the frame """
        super(Application, self).__init__(master)
        self.grid()
        self.slider_dict = {"red": 0, "green": 0, "blue": 0}
        self.drawing_canvas = Canvas(self, width=400, height=300, bg="white", cursor="cross")
        self.drawing_canvas.grid(row=0, column=0, columnspan=3)
        self.drawing_canvas.bind("<Button-1>", self.on_line_start)
        self.drawing_canvas.bind("<B1-Motion>", self.on_line_motion)
        self.drawn = None
        self.tk_rgb = "#%02x%02x%02x" % tuple(self.slider_dict.values())
        self.line = self.drawing_canvas.create_line
        self.create_widgets()

    def create_widgets(self):
        self.red_slider = Scale(self, from_=0, to=255, orient=HORIZONTAL)
        self.red_slider.grid(row=1, column=0, sticky=S)
        self.red_slider.config(command=lambda x: self.slider_values("red", self.red_slider.get()))

        self.lbl_red = Label(self, text="R", fg="red", font=("Arial", 14))
        self.lbl_red.grid(row=1, column=0, sticky=S+W)

        self.green_slider = Scale(self, from_=0, to=255, orient=HORIZONTAL)
        self.green_slider.grid(row=1, column=2, sticky=S)
        self.green_slider.config(command=lambda x: self.slider_values("green", self.green_slider.get()))

        self.lbl_green = Label(self, text="G", fg="green", font=("Arial", 14))
        self.lbl_green.grid(row=1, column=2, sticky=S+W)

        self.blue_slider = Scale(self, from_=0, to=255, orient=HORIZONTAL)
        self.blue_slider.grid(row=2, column=1, sticky=S)
        self.blue_slider.config(command=lambda x: self.slider_values("blue", self.blue_slider.get()))

        self.lbl_blue = Label(self, text="B", fg="blue", font=("Arial", 14))
        self.lbl_blue.grid(row=2, column=1, sticky=S+W)

        self.btn_clear = Button(self, text="CLEAR", command=lambda: self.clear_canvas("all"))
        self.btn_clear.grid(row=1, column=1, sticky=S+W+E)

    def slider_values(self, dict_key, value):
        self.slider_dict[dict_key] = value
        self.tk_rgb = "#%02x%02x%02x" % tuple(self.slider_dict.values())

    def clear_canvas(self, arg):
        self.drawing_canvas.delete(arg)

    def on_line_start(self, event):
        self.shape = self.line
        self.drawn = None
        self.line_start = event

    def on_line_motion(self, event):
        canvas = event.widget
        if self.drawn:
            canvas.delete(self.drawn)
        create_line = self.shape(self.line_start.x, self.line_start.y, event.x, event.y)
        self.drawn = create_line
        self.drawing_canvas.itemconfig(self.drawn, fill=self.tk_rgb)


root = Tk()
# Set attributes
root.title("Canvas")
root.geometry("400x400")
# Create framework
app = Application(root)
app.grid()

# Kick off the event handler loop
root.mainloop()
