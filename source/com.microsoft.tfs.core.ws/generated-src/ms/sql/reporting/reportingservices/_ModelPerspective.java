// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.sql.reporting.reportingservices;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.sql.reporting.reportingservices._ModelPerspective;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _ModelPerspective
    implements ElementSerializable, ElementDeserializable
{
    // No attributes    

    // Elements
    protected String iD;
    protected String name;
    protected String description;

    public _ModelPerspective()
    {
        super();
    }

    public _ModelPerspective(
        final String iD,
        final String name,
        final String description)
    {
        // TODO : Call super() instead of setting all fields directly?
        setID(iD);
        setName(name);
        setDescription(description);
    }

    public String getID()
    {
        return this.iD;
    }

    public void setID(String value)
    {
        this.iD = value;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String value)
    {
        this.name = value;
    }

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String value)
    {
        this.description = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "ID",
            this.iD);
        XMLStreamWriterHelper.writeElement(
            writer,
            "Name",
            this.name);
        XMLStreamWriterHelper.writeElement(
            writer,
            "Description",
            this.description);

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("ID"))
                {
                    this.iD = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("Name"))
                {
                    this.name = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("Description"))
                {
                    this.description = reader.getElementText();
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}
