##om-tut

Example of the simple om tutorial that works in IE8 (with HTML5 doctype)

####How to validate the error

```
lein cljsbuild once om-tut
python -m SimpleHTTPServer
```
Navigate to http://box_ip_address:8000 from windows7/IE8 browser. Click on the add contact input field, previously the error would show, it doesn't any more.

Enter a name (e.g. David Nolen) and click 'Add Contact' button and the contact should be added
