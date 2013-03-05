/**
 * Copyright (C) 2005-2012 Alfresco Software Limited.
 * 
 * This file is part of Alfresco
 * 
 * Alfresco is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * Alfresco is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Alfresco. If not, see <http://www.gnu.org/licenses/>.
 */

package org.alfresco.integrations.google.docs.exceptions;


public class MustDowngradeFormatException
    extends Exception
{

    /**
     * @author Jared Ottley <jared.ottley@alfresco.com>
     */
    private static final long serialVersionUID = 1L;


    public MustDowngradeFormatException()
    {
        super();
    }


    public MustDowngradeFormatException(String message, Throwable cause)
    {
        super(message, cause);
    }


    public MustDowngradeFormatException(String message)
    {
        super(message);
    }


    public MustDowngradeFormatException(Throwable cause)
    {
        super(cause);
    }

}