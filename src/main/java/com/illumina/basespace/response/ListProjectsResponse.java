/**
* Copyright 2013 Illumina
* 
 * Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
*  You may obtain a copy of the License at
*    http://www.apache.org/licenses/LICENSE-2.0
* 
 *  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
*/

package com.illumina.basespace.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.illumina.basespace.entity.Project;
import com.illumina.basespace.entity.ProjectCompact;
import com.illumina.basespace.param.QueryParams;

public class ListProjectsResponse extends ApiResponse<ProjectCompact, Project>
{
    @Override
    public ProjectCompact[] items()
    {
        return itemResponse.items;
    }

    @Override
    public QueryParams getMetaData()
    {
        return itemResponse;
    }

    @JsonProperty("Response")
    private ProjectItems itemResponse;

    public class ProjectItems extends QueryParams
    {
        @JsonProperty("Items")
        private ProjectCompact[] items;

    }
}
