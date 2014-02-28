Steps to make a basic canvas.

1) Extend View and name it DrawView
2) Override public void onDraw(Canvas canvas)
3) Call the super method (super.onDraw(canvas))
4) Draw to the canvas
5) Call this.invalidate() so the application continues to redraw.

6) Create a DrawView in OnCreate and set the Content view to it.  I name mine screen