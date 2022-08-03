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

And I used them in Child or Sub-Child syntax:
`ParentTagName[attributeName="Value“]ChildTagName[attributeName="Value“]`

The cssSelector I wrote it are:
- FullName TextField
```md
div[class='form_info'] input[placeholder^='First ']
```
- Email TextField
```md
div[class='form_info'] input[placeholder$='Address']
```

- Saudi Arabia Option
```md
li[data-dial-code*='966']
```

- PhoneNumber TextField
```md
div[class='form_info'] input[placeholder^='201']
```

- Location Option
```md
div[class^='form_info\'] option[value*='Los ']
```

- Submit Button
```md
div[class='form_info'] input[value$='Packet']
```


<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/182590769-ba700696-c7c3-44b9-8b11-991c28a6a5f1.png" width=80% height=80%>
</p>

---
## Output Screenshots:

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/182591748-9b4c73e1-9561-4977-9e04-c7204b74b2fd.png" width=80% height=80%>


https://user-images.githubusercontent.com/48597284/182591806-c410f4ef-780b-4942-b10f-2012e329595a.mp4
</p>
