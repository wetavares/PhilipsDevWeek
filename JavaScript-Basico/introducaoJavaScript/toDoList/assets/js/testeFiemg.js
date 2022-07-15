function OEE(QUA, DISP, PERF){
    let qualidade = Number(QUA);
    let disponibilidade = Number(DISP);
    let performace = Number(PERF);
    let oee ;
    oee = qualidade * disponibilidade * performace;
    alert("OEE = " + oee);
}