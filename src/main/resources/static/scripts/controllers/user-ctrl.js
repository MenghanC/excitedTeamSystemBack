/**
 * Created by Arie on 16/9/24.
 */
angular.module('urbanApp')
    .controller('userCtrl', ['$scope', '$http','$rootScope','$state', userCtrl]);

function userCtrl($scope, $http,$rootScope,$state) {

    var userType = $rootScope.userType;
    $scope.isPending = false;


    // $http({
    //     method: 'GET',
    //     url: '/company/get/'+ $scope.company_name,
    //     headers: {'Content-Type': 'application/json'}
    // }).error(function () {
    //     console.log("error");
    //
    // }).success(function (result) {
    //
    //     console.log($scope.infoFlag);
    //     console.log(result);
    // });

    $scope.register = function() {
        console.log("register");
        var companyData = { 
            "company_name" : $scope.company_name, 
            "start_date" : $scope.start_date, 
            "description": "",
            "legal_person": $scope.legal_person, 
            "capital" : $scope.capital, 
            "capital_lasting" : $scope.capital_lasting, 
            "asset" : $scope.asset, 
            "gross_margin" : $scope.gross_margin,
            "main_business" : $scope.main_business,
            "net_income": $scope.net_income,
            "inventory": $scope.inventory,
            "founders" : $scope.founders, 
            "liability" : $scope.liability, 
            "industry" : $scope.industry, 
            "region" : $scope.region, 
            "size" : $scope.size, 
            "revenue" : $scope.revenue, 
            "sector" : $scope.sector, 
            "monthly_burn_rate" : $scope.monthly_burn_rate ,
            "sales": $scope.sales,
            "average_total_assets": $scope.average_total_assets,
            "average_stockholder_equity": $scope.average_stockholder_equity
    };
          
        $http({
              method: 'POST', 
              url: '/company/create', 
              data: companyData, 
              headers: {'Content-Type': 'application/json'} 
          }).success(function () { 
              console.log("post successfully");
              $state.go('app.account');
              $http({
                  method: 'GET',
                  url: '/company/get/'+ $scope.company_name,
                 headers: {'Content-Type': 'application/json'}
             }).success(function (result) {
                   $rootScope.infoFlag = true;
                   console.log($rootScope.infoFlag);
                   console.log(result);
                  // $scope.companyName = result.companyName;
                  // $scope.description = result.description;
                  // $scope.industry = result.industry;
                  // $scope.isTrusted = result.isTrusted;
                  // $scope.profitMargin = result.profitMargin;
                  // $scope.returnOnEquity = result.returnOnEquity;
                  // $scope.returnOnAssets = result.returnOnAssets;
                  // $scope.currentRatio = result.companyName;
                  console.log(companyData);
            });
          });
    }

};
