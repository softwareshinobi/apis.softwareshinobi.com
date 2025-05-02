
//alert("seperated!")

        $(document).ready(function () {

            $("#tableSwapi").dataTable();

            $.ajax({
                url: 'http://huracan.softwareshinobi.com:8888/story',
                type: 'get',
                dataType: 'json',
                success: function (apiData) {

                    var html = '';

console.log("apiData",apiData)

                    $.each(apiData, function (i, data) {

                        html += `<tr>
              
    <td> ` + data.id + `</td>
    <td>` + data.project + `</td>
    <td> ` + data.name + ` <br></td>
    <td> ` + data.intention + ` <br></td>
    <td> ` + data.description + ` <br></td>
    <td> ` + data.status + ` <br></td>

                                    </tr>`;

                        //This is selector of my <tbody> in my table
                        $("#tbody-situationList").html(html);
                    });
                }
            });
        })
