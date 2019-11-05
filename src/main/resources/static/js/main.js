$(document).ready(function () {
    $("#sort-form").submit(function (event) {
        event.preventDefault();
        fire_ajax_submit();
    });
});

/**
 *
 */
function fire_ajax_submit() {
    var values = $("#sort-box").val().split(',');
    setSortButtonDisable(true);
    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/sorting-app/sort",
        data: JSON.stringify({values: values}),
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {
            var html = buildSuccessResponseHtml(data);
            setResponseContent(html);
            if (isSorted(data.values)) {
                console.log('sort is valid');
            }
            setSortButtonDisable(false);
        },
        error: function (e) {
            var json = "<h4>Ajax Response</h4><pre>" + e.responseText + "</pre>";
            setResponseContent(json);
            setSortButtonDisable(false);

        }
    });

}

/**
 *
 * @param disabled
 */
function setSortButtonDisable(disabled) {
    $("#btn-sort").prop("disabled", disabled);
}

/**
 *
 * @param json
 */
function setResponseContent(json) {
    $('#ajax-response-container').html(json);
}

function buildSuccessResponseHtml(data) {
    return '<div class="card mb-5">' +
        '<div class="card-header">Ajax Response </div>' +
        '<div class="card-body">' +
        (isSorted(data.values) ? '<div class="text-success mb-2">Returned response is sorted</div>' : '<div class="text-danger mb-2">Returned response is not sorted</div>')+
        '<pre>' + JSON.stringify(data, null, 4) + '</pre>' +
        '</div>' +
        '</div>';
}



function isSorted(array) {
    var sorted = array.slice().sort();
    return sorted.join('') === array.join('');
}
