#<foo>
#   <bar>
#      <type foobar="1"/>
#      <type foobar="2"/>
#   </bar>
#</foo>

import xml.etree.ElementTree
e = xml.etree.ElementTree.parse('thefile.xml').getroot()
for atype in e.findall('type'):
    print(atype.get('foobar'))
    
#or 

#<data>
#    <items>
#        <item name="item1"></item>
#        <item name="item2"></item>
#        <item name="item3"></item>
#        <item name="item4"></item>
#    </items>
#</data>

from xml.dom import minidom
xmldoc = minidom.parse('items.xml')
itemlist = xmldoc.getElementsByTagName('item')
print(len(itemlist))
print(itemlist[0].attributes['name'].value)
for s in itemlist:
    print(s.attributes['name'].value)
