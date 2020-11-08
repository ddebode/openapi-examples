%title: Openapi - Presentation
%author: ddebode
%date: 2020-11-07

-> # Openapi - presentation <-
==============================

The OpenAPI Specification (OAS) defines a standard, language-agnostic interface to RESTful APIs 
which allows both humans and computers to discover and understand the capabilities of the service 
without access to source code, documentation, or through network traffic inspection. 
When properly defined, a consumer can understand and interact with the remote service with a minimal
amount of implementation logic.

An OpenAPI definition can then be used by documentation generation tools to display the API, 
code generation tools to generate servers and clients in various programming languages, 
testing tools, and many other use cases.

-------------------------------------------------

-> # History <-

2011 first version released of Swagger spec
2015 Acquired by Smartbear
2016 Swagger specification renamed to OpenAPI Specification
2017 OpenAPI 3.0.0 is released

-------------------------------------------------

-> # 3.0 vs 2.0 <-


-------------------------------------------------

-> # Supported markdown formatting <-

Second-level headers can be prefixed by *##* or
underlined by *---*.

second-level
\------------

becomes

second-level
------------


-------------------------------------------------

-> # Supported markdown formatting's <-

Inline codes are surrounded with backticks.

C program starts with \`main()\`.

becomes

C program starts with `main()`.

-------------------------------------------------

-> # Supported markdown formatting <-

Code blocks are automatically detected by 4 spaces
at the beginning of a line.

Tabs are automatically expanded to 4 spaces while
parsing the input.

\    int main(int argc, char \*argv[]) {
\        printf("%s\\n", "Hello world!");
\    }

becomes

    int main(int argc, char *argv[]) {
        printf("%s\n", "Hello world!");
    }

-------------------------------------------------

-> # Supported markdown formatting <-

You can also use [pandoc](https://pandoc.org/MANUAL.html#fenced-code-blocks)'s fenced code block
extension. Use at least three ~ chars to open and
at least as many or more ~ for closing.

\~~~ {.numberLines}
\int main(int argc, char \*argv[]) {
\    printf("%s\\n", "Hello world!");
\}
\~~~~~~~~~~~~~~~~~~

becomes

~~~ {.numberLines}
int main(int argc, char *argv[]) {
    printf("%s\n", "Hello world!");
}
~~~~~~~~~~~~~~~~~~

Pandoc attributes (like ".numberlines" etc.)
will be ignored

-------------------------------------------------

-> # Supported markdown formatting <-

You can also use [github](https://guides.github.com/features/mastering-markdown/#GitHub-flavored-markdown) flavored markdown's
code block. Use at least three backticks to open
and at least as many or more backticks for closing.

\```
\int main(int argc, char \*argv[]) {
\    printf("%s\\n", "Hello world!");
\}
\```

becomes

```
int main(int argc, char *argv[]) {
    printf("%s\n", "Hello world!");
}
```

Language hint will be ignored

-------------------------------------------------

-> # Supported markdown formatting <-

Quotes are auto-detected by preceding *>*.

Multiple *>* are interpreted as nested quotes.

\> quote
\>> nested quote 1
\> > nested quote 2

becomes

> quote
>> nested quote 1
> > nested quote 2

-------------------------------------------------

-> # Supported markdown formatting <-

Inline highlighting is supported as followed:

\- *\** colors text as red
\- *\_* underlines text

\_some\_ \*highlighted\* \_\*text\*\_

becomes

_some_ *highlighted* _*text*_

-------------------------------------------------

-> # Supported markdown formatting <-

Backslashes force special markdown characters
like *\**, *\_*, *#* and *>* to be printed as
normal characters.

\\\*special\\\*

becomes

\*special\*

-------------------------------------------------

-> # Supported markdown formatting <-

Leading *\** or *-* indicate lists.

list
\* major
\    - minor
\        - \*important\*
\          detail
\    - minor

becomes

list
* major
    - minor
        - *important*
          detail
    - minor

-------------------------------------------------

-> # Supported markdown formatting <-

A single *\<br\>* or *^* in a line indicates mdp
to stop the output on that position.

This can be used to show bullet points
line by line.

*\<br\>* is also not displayed in HTML converted
output.

Agenda
<br>
* major
<br>
    * minor
<br>
* major
  ^
    * minor
      ^
        * detail

-------------------------------------------------

-> # Supported markdown formatting <-

Leading *->* indicates centering.

\-> # test <-
\-> ## test <-
\-> test
\-> \_\*test\*\_ <-

becomes

-> # test <-
-> ## test <-
-> test
-> _*test*_ <-

-------------------------------------------------

-> # Supported markdown formatting <-

URL in pandoc style are supported:

\[Google](http://www.google.com/)

becomes

[Google](http://www.google.com/)

-------------------------------------------------

-> ## More information about markdown <-

can be found in the [markdown documentation](http://daringfireball.net/projects/markdown/).

-------------------------------------------------

-> # Support for UTF-8 special characters <-

Here are some examples.

ae = ä, oe = ö, ue = ü, ss = ß
upsilon = Ʊ, phi = ɸ

▛▀▀▀▀▀▀▀▀▀▜
▌rectangle▐
▙▄▄▄▄▄▄▄▄▄▟


-------------------------------------------------

-> # Suspend your presentation for hands-on examples <-

Use *Ctrl + z* to suspend the presentation.

Use *fg* to resume it.

-------------------------------------------------

-> # Convert your presentation to PDF <-

To publish your presentation later on, you may
want to convert it to PDF.

This can be achieved by two additional tools:

\- *markdown* to convert to HTML
\- *wkhtmltopdf* to convert from HTML to PDF

After installing them, you can simply type:

    $ markdown sample.md | wkhtmltopdf - sample.pdf

-------------------------------------------------

-> ## Last words <-

I hope you like *mdp*.

If you observe strange behavior, feel free to
open an issue on [GitHub](https://github.com/visit1985/mdp).
