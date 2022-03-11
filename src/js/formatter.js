function formatarCNPJ(item) {
    const cnpj = item.value;
    item.value = cnpj.replace(/(\d{2})(\d{3})(\d{3})(\d{4})(\d{2})/, "$1.$2.$3/$4-$5");
}
function formatarCEP(item) {
    const cep = item.value;
    item.value = cep.replace(/(\d{5})(\d{3})/, "$1-$2");
}
function formatarTelefone(item) {
    const telefone = item.value;
    item.value = telefone.replace(/(\d{2})(\d{5})(\d{4})/, "($1) $2-$3");
}