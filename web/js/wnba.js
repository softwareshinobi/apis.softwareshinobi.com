
//alert("seperated!")

        $(document).ready(function () {

            $("#tableSwapi").dataTable();

            $.ajax({
                url: 'https://apis.softwareshinobi.com/wnba/odds',
                type: 'get',
//                dataType: 'json',
                success: function (apiData) {

                    var html = '';

console.log("apiData",apiData)

                    $.each(apiData, function (i, data) {

                        html += `<tr>
              
    <td> ` + data.date + `</td>

    <td>` + data.away_team + `</td>
    <td> ` + data.away_money_line	 + ` <br></td>

    <td> ` + data.home_team + ` <br></td>
    <td> ` + data.home_money_line	 + ` <br></td>

    <td> ` + data.over_under + ` <br></td>

                                    </tr>`;

                        //This is selector of my <tbody> in my table
                        $("#tbody-situationList").html(html);
                    });
                }
            });
        })
