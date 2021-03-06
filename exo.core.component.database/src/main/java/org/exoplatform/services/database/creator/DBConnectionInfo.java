/*
 * Copyright (C) 2010 eXo Platform SAS.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.exoplatform.services.database.creator;

import java.util.Map;

/**
 * Class contains needed database connection information. 
 * 
 * @author <a href="anatoliy.bazko@exoplatform.org">Anatoliy Bazko</a>
 * @version $Id$
 */
public class DBConnectionInfo
{
   private final Map<String, String> connectionProperties;

   private final String dbName;

   /**
    * DBConnectionInfo constructor.
    * @param connectionProperties
    *          connection properties      
    */
   public DBConnectionInfo(String dbName, Map<String, String> connectionProperties)
   {
      this.dbName = dbName;
      this.connectionProperties = connectionProperties;
   }

   public Map<String, String> getProperties()
   {
      return connectionProperties;
   }

   public String getDBName()
   {
      return dbName;
   }
}
