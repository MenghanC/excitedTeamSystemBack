/**
 * Created by Arie on 16/9/24.
 */


angular.module('urbanApp')
    .controller('candidatesCtrl', ['$scope', '$http','$rootScope', candidatesCtrl]);

function candidatesCtrl($scope, $http,$rootScope) {
    $http({
        method: 'GET',
        url: '/company/getAll',
        headers: {'Content-Type': 'application/json'}
    }).success(function (result) {
        $scope.candidateList = result;
    });
};
