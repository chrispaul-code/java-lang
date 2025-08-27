# Recreating the logo with a similar style to the user's new reference
from PIL import ImageDraw, ImageFont

# Reinitialize the canvas
canvas = Image.new("RGB", (800, 800), "white")

draw = ImageDraw.Draw(canvas)

# Define color palette and positions for the browser window
browser_colors = ["#3F8F5B", "#FF5F56", "#FFBD2E", "#27C93F"]
browser_bg_color = browser_colors[0]

# Draw the browser rectangle
browser_rect = [50, 50, 750, 200]
draw.rectangle(browser_rect, fill=browser_bg_color, outline="black", width=4)

# Draw browser buttons inside
button_radius = 15
button_positions = [(70, 70), (110, 70), (150, 70)]
button_colors = browser_colors[1:]
for pos, color in zip(button_positions, button_colors):
    draw.ellipse([pos[0] - button_radius, pos[1] - button_radius, 
                  pos[0] + button_radius, pos[1] + button_radius], fill=color, outline="black")

# Prepare the text "THE CATCHY PIXEL" in a blocky font
try:
    font_main = ImageFont.truetype("/usr/share/fonts/truetype/dejavu/DejaVuSans-Bold.ttf", 95)
except IOError:
    font_main = ImageFont.load_default()

# Centralizing text with uniform spacing between words
text = "THE\nCATCHY\nPIXEL"
text_x, text_y = 100, 300
line_spacing = 10

for line in text.split("\n"):
    draw.text((text_x, text_y), line, font=font_main, fill="black")
    text_y += font_main.getsize(line)[1] + line_spacing

# Save the output
output_final = "/mnt/data/finalized_logo.png"
canvas.save(output_final)
output_final