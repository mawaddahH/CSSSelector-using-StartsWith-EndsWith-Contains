# CSSSelector-using-StartsWith-EndsWith-Contains
Assignment 5 W9D3 - SDA - Software QA Bootcamp

## Table of contents
* [Question](#question)
* [Answer](#answer)
* [Output Screenshots](#output-screenshots)

---
## Question
Locate with CSSSelector using StartsWith, EndsWith, and Contains filling and submitting a Course Packet form.
- STEP 1: Go to codingdojo.com
- STEP 2: Go to Master Course Packet Form
- STEP 3: Right-click on the first field, i.e. First and Last Name and click on inspect for the HTML Code 
- STEP 4: Extract Xpath for this field with CSS Locator using StartsWith
- STEP 4: Same way complete the flow of filling the form using Saudi Arabia phone extension and submitting the form

## Answer

I used a ["Coding Dojo"](https://www.codingdojo.com/)
And Before running the code, there are some steps that need to take considered:


### First:
Setup Latest Web Driver for Chrome  Driver.
Donwload the necessary jar files:
- Selenium (Lastest).
- TestNG (Lastest).
- commander (Lastest).

### Second:
Add them as a library in the classpath of the project
- _click-reight on the file project >Build path > configure Bild path > Java Build Path > Libraries > classpath > add external JARs > Apply and close_.

### Third:
I opened the website, then take web elements, and then add them to the code I use cssSelector with using StartsWith, EndsWith, & Contains as syntax:
- `tagName[attributeName^=”starting text of attribute Value“]` - StartsWith
- `tagName[attributeName$=”Ending Text of Attribute Value“]` - EndsWith
- `tagName[attributeName*="sub string of Attribute Value“]` - Contains

The cssSelector I wrote it are:
- Username TextField
```md
input#email[name='email']
```
- Password TextField
```md
input#pass[name='pass']
```
- Login Button
```md
button[name='login']
```


<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/182497037-314ce1c3-a6b2-44b4-a3d2-c8184550c2d7.png" width=60% height=60%>
</p>

---
## Output Screenshots:

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/182498824-d9928cef-b525-4d48-857a-1d3110f59ce2.png" width=80% height=80%>


https://user-images.githubusercontent.com/48597284/182498848-310126df-c972-476c-b611-9f56274ee7ac.mp4
</p>
