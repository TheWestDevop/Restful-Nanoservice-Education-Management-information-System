
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<section class="header">
      <h1>
          &nbsp;&nbsp;<i class="fa fa-dashboard">&nbsp;Dashboard  <small>School Data</small></i>
       
      </h1>
      <ol class="breadcrumb">
        <li><a href="#/"><i class="fa fa-home"></i> Home</a></li>
        <li class="active">Dashboard</li>
      </ol>
    </section>
<section class="container">
   
  <div id="mChart" Style=" border-radius:10px;width:90%; height:500px; display:block">
  </div><br>                   
 <div id="mChart2" Style=" border-radius:10px;width:90%; height:500px; display:block">
 </div><br>
 <div id="mChart3" Style=" border-radius:10px;width:90%; height:500px; display:block">
 </div><br>                 
 <div id="mChart4" Style=" border-radius:10px;width:90%; height:500px; display:block">
 </div><br>                 
 <div id="mChart5" Style=" border-radius:10px;width:90%; height:500px; display:block">
 </div><br>
</section>

 <script>
      
$(document).ready(function(){
 
var chart = new CanvasJS.Chart("mChart", {
	animationEnabled: true,
        exportEnabled:true,
	title:{
		text: "Weekly School Income"
	},	
	toolTip: {
		shared: true
	},
	legend: {
		cursor:"pointer",
		itemclick: toggleDataSeries
	},
        axisY:{
            interval:50
        },
	data: [{
		type: "line",
		name: "Total School fee Payed in ",
		legendText: "Payment Made into the School",
		showInLegend: true, 
		dataPoints:[
			{ label: "Monday", y: 266.21 },
			{ label: "Tuesday", y: 302.25 },
			{ label: "Wenesday", y: 157.20 },
			{ label: "Thursday", y: 148.77 },
			{ label: "Friday", y: 101.50 },
			{ label: "Saturday", y: 97.8 },
                        { label: "Sunday", y: 50.8 }
		]
	}]
	
});
chart.render();


var chartTwo = new CanvasJS.Chart("mChart2", {
	animationEnabled: true,
        exportEnabled:true,
	title:{
		text: "School Expenditure"
	},	
	toolTip: {
		shared: true
	},
	legend: {
		cursor:"pointer",
		itemclick: toggleDataSeries
	},
       
	data: [{
		type: "pie",
		name: "Total School Expenditure Base on Each Sector",
		
		showInLegend: true, 
		dataPoints:[
			{ label: "School Transportation", y: 266.21,legendText:"Transportation" },
			{ label: "School Event", y: 302.25,legendText:"Event" },
			{ label: "School Re-Creation", y: 500.20,legendText:"Re-Creation" },
			{ label: "School Material", y: 148.77,legendText:"Material" },
			{ label: "School Welfare", y: 101.50,legendText:"Welfare" },
			{ label: "School Salaries", y: 797.8 ,legendText:"Salaries"}
                        
		]
	}]
	
});
chartTwo.render();


var chartThree = new CanvasJS.Chart("mChart3", {
	animationEnabled: true,
        exportEnabled:true,
	title:{
		text: "School Budget"
	},	
	toolTip: {
		shared: true
	},
	legend: {
		cursor:"pointer",
		itemclick: toggleDataSeries
	},
        data: [{
		type: "pie",
		name: "School Budget Base on Each Sector",
		
		showInLegend: true, 
		dataPoints:[
			{ label: "School Transportation", y: 500,legendText:"Transportation" },
			{ label: "School Event", y: 302.25,legendText:"Event" },
			{ label: "School Re-Creation", y: 350,legendText:"Re-Creation"},
			{ label: "School Material", y: 150.77,legendText:"Material" },
			{ label: "School Welfare", y: 200.50,legendText:"Welfare" },
			{ label: "School Salaries", y: 1000.8,legendText:"Salaries" }
                        
		]
	}]
	
});
chartThree.render();



var chartFour = new CanvasJS.Chart("mChart4", {
	animationEnabled: true,
        exportEnabled:true,
	title:{
		text: "School Income Base Each Classes"
	},	
	toolTip: {
		shared: true
	},
	legend: {
		cursor:"pointer",
		itemclick: toggleDataSeries
	},
        axisY:{
            interval:50
        },
	data: [{
		type: "column",
		name: "School Income Base on Each Classes",
		legendText: "School Income Base on Each Classes",
		showInLegend: true, 
		dataPoints:[
			{ label: "Creche", y: 266.21 },
			{ label: "Kindergarten",y: 400.25 },
			{ label: "Nursery One", y: 500.20 },
			{ label: "Nursery Two", y: 70.77 },
			{ label: "Primary One", y: 150.50 },
			{ label: "Primary Two", y: 700.8 },
                        { label: "Primary Three",y: 120.50 },
			{ label: "Primary Four", y: 600.8 },
                        { label: "Primary Five", y: 100.50 },
			{ label: "Primary Six",  y: 300.8 }
                        
		]
	}]
	
});
chartFour.render();

var chartFive = new CanvasJS.Chart("mChart5", {
	animationEnabled: true,
        exportEnabled:true,
	title:{
		text: "Incoming Student/Out-going Student data"
	},	
	toolTip: {
		shared: true
	},
	legend: {
		cursor:"pointer",
		itemclick: toggleDataSeries
	},
        
	data: [{
		type: "doughnut",
		name: "Admission Management ",
		
		showInLegend: true, 
		dataPoints:[
			{ y: 266.21,label: "Admitted Student",legendText: "Total Number of New Admitted Student"},
			{ y: 400.25,label: "Out-going Student",legendText: "Total Number of Out-going Student" }
                        
		]
	}]
	
});
chartFive.render();
function toggleDataSeries(e) {
	if (typeof(e.dataSeries.visible) === "undefined" || e.dataSeries.visible) {
		e.dataSeries.visible = false;
	}
	else {
		e.dataSeries.visible = true;
	}
	chart.render();
}


}
);


 </script>
       

       